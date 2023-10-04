import { Component } from '@angular/core';
import { HomeService } from '../home/home.service';
import { IAppuntamento } from 'src/app/interface/iappuntamento';
import { IRequest } from 'src/app/interface/irequest';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-appointments',
  templateUrl: './appointments.component.html',
  styleUrls: ['./appointments.component.scss']
})
export class AppointmentsComponent {

  searchLocation:string = '';

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

  appointments:IAppuntamento[]=[]
  requestsApp:IRequest[]=[]

  admin!:string



  constructor(private route:ActivatedRoute, private homeSvc:HomeService, private router:Router){}

  deleteApp(id:number){
    this.homeSvc.deleteApp(id)
    .subscribe((data) =>{
      let index = this.appointments.findIndex(el => el.id === id)
      this.appointments.splice(index, 1)
      this.allApp();
    })
  }

  allApp(){
    this.homeSvc.getAllApp()
    .subscribe((res)=>{
      this.requestsApp = res;
      console.log(res);

    })
  }

  getOneApp(){
    this.route.params.subscribe
    ((params: any) => {
      this.homeSvc.getApp(params.id)
      .subscribe((res) => {
        this.app = res
      })
    })
  }


  searchApp(){
    this.homeSvc.searchAppName(this.searchLocation)
    .subscribe((res)=>{
      this.requestsApp = res;
      console.log(res);
    })
}
}
