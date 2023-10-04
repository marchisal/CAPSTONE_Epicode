import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HomeService } from '../home/home.service';
import { IPreventivo } from 'src/app/interface/ipreventivo';
import { IRequest } from 'src/app/interface/irequest';

@Component({
  selector: 'app-quotes',
  templateUrl: './quotes.component.html',
  styleUrls: ['./quotes.component.scss']
})
export class QuotesComponent {

  searchLocation:string = '';

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

  quotes:IPreventivo[]=[]
  requestsPrev:IRequest[]=[]


  admin!:string

  constructor(private route:ActivatedRoute, private homeSvc:HomeService, private router:Router){}


  deletePrev(id:number){
    this.homeSvc.deletePrev(id)
    .subscribe((data) =>{
      let index = this.quotes.findIndex(el => el.id === id)
      this.quotes.splice(index, 1)
      this.allPrev();
    })
  }

  allPrev(){
    this.homeSvc.getAllPrev()
    .subscribe((res)=>{
      this.requestsPrev = res;
      console.log(res);

    })
  }

  getOnePrev(){
    this.route.params.subscribe
    ((params: any) =>{
      this.homeSvc.getPrev(params.id)
      .subscribe((res) =>{
        this.prev = res
      })
    })
  }


  searchPrev(){
    this.homeSvc.searchPrevName(this.searchLocation)
    .subscribe((res)=>{
      this.requestsPrev = res;
      console.log(res);
    })
}
}
