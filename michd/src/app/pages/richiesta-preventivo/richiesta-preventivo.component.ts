import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { HomeService } from '../home/home.service';
import { IRequest } from 'src/app/interface/irequest';

@Component({
  selector: 'app-richiesta-preventivo',
  templateUrl: './richiesta-preventivo.component.html',
  styleUrls: ['./richiesta-preventivo.component.scss']
})
export class RichiestaPreventivoComponent implements OnInit {

  form!: FormGroup;

  validazione:boolean = false

  prev:IRequest = {
    id: 0,
    name: '',
    surname: '',
    fiscalCode: '',
    telephoneNumber: '',
    email: '',
    tattooDescription: '',
    tattooSize: '',
    bodyPart: ''
  }

  constructor(private homeSvc:HomeService, private router:Router, private fb: FormBuilder, private route:ActivatedRoute) {}



  ngOnInit(){
    this.form = this.fb.group({
      name : this.fb.control(null),
      surname : this.fb.control(null),
      fiscalCode : this.fb.control(null),
      telephoneNumber : this.fb.control(null),
      email: this.fb.control(null),
      tattooDescription: this.fb.control(null),
      tattooSize: this.fb.control(null),
      bodyPart: this.fb.control(null),
    })
    this.form.valueChanges.subscribe(value => console.log(value))
    console.log(this.form)


    this.route.params.subscribe
    ((params: any) => {
      this.homeSvc.getPrev(params.id)
      .subscribe((res) => {
        if(res!=null){
        this.prev = res
        console.log(res);
        this.validazione = true
        console.log(this.prev);
      }
      })
    })
  }

  inviaInfoPrev(){

    if(this.form.value.name != null
    && this.form.value.surname != null
    && this.form.value.fiscalCode != null
    && this.form.value.telephoneNumber != null
    && this.form.value.email != null
    && this.form.value.tattooDescription != null
    && this.form.value.tattooSize != null
    && this.form.value.bodyPart != null ){
      if(this.form.value.tattooSize != "default"){

    this.homeSvc.postPrev(this.form.value)
    .subscribe((res)=>{
      alert("Richiesta inviata");
      this.router.navigate(['/home'])
      console.log(this.form);
    },
    ((err)=>{
      alert("Richiesta NON inviata");
      console.log(err);
      this.router.navigate(['/richiestaPreventivo'])
    }))
  }
  else{
    alert("Seleziona una grandezza valida");
  }
  }else{
    alert("Riempi tutti i campi");
  }
  }


  nrSelect = "default"


  changePrev(){
    this.route.params.subscribe((params: any) => {
      this.homeSvc.putPrev(this.form.value, params.id)
      .subscribe((res) => {
        alert("Preventivo modificato")
        this.router.navigate(['/quotes'])
      })
    })
  }

}
