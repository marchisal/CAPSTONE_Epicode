import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router,Params } from '@angular/router';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { HomeService } from '../home/home.service';
import { IRequest } from 'src/app/interface/irequest';

@Component({
  selector: 'app-richiesta-appuntamento',
  templateUrl: './richiesta-appuntamento.component.html',
  styleUrls: ['./richiesta-appuntamento.component.scss']
})
export class RichiestaAppuntamentoComponent implements OnInit {

  form!: FormGroup;

  validazione:boolean = false

  constructor(private homeSvc:HomeService, private router:Router, private fb: FormBuilder, private route:ActivatedRoute) {}

  app:IRequest = {
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
      this.homeSvc.getApp(params.id)
      .subscribe((res) => {
        if(res!=null){
        this.app = res
        this.validazione = true
        console.log(res);
      }

      })
    })
  }

  inviaInfoApp(){

    if(this.form.value.name != null
    && this.form.value.surname != null
    && this.form.value.fiscalCode != null
    && this.form.value.telephoneNumber != null
    && this.form.value.email != null
    && this.form.value.tattooDescription != null
    && this.form.value.tattooSize != null
    && this.form.value.bodyPart != null ){
      if(this.form.value.tattooSize != "default"){

    this.homeSvc.postApp(this.form.value)
    .subscribe((res)=>{
      alert("Richiesta inviata");
      this.router.navigate(['/home'])
      console.log(this.form);
    },
    ((err)=>{
      alert("Richiesta NON inviata");
      console.log(err);
      this.router.navigate(['/richiestaAppuntamento'])
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

  changeApp(){
    this.route.params.subscribe((params: any) => {
      this.homeSvc.putApp(this.form.value, params.id)
    .subscribe((res)=>{
      alert("Apputamento modificato")
      this.router.navigate(['/appointments'])
    })
    });






  }
  }




