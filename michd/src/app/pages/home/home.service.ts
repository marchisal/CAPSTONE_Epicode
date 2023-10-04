import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IAppuntamento } from 'src/app/interface/iappuntamento';
import { environment } from 'src/environments/environment.development';
import { IPreventivo } from 'src/app/interface/ipreventivo';
import { IRequest } from 'src/app/interface/irequest';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  apiUrl:string = environment.url

  apiReqUrl:string = environment.urlRichieste

  constructor(private http:HttpClient) { }


  postApp(el:IAppuntamento){
    return this.http.post<IAppuntamento>(this.apiReqUrl + "appointment", el);
  }

  postPrev(el:IPreventivo){
    return this.http.post<IPreventivo>(this.apiReqUrl + "quote", el);
  }

  getAllApp(){
    return this.http.get<IAppuntamento[]>(this.apiUrl + 'appointment/all')
  }

  getAllPrev(){
    return this.http.get<IPreventivo[]>(this.apiUrl + 'quote/all')
  }

  getApp(id:number){
    return this.http.get<IAppuntamento>(this.apiUrl + 'appointment/' + id)
  }

  getPrev(id:number){
    return this.http.get<IPreventivo>(this.apiUrl + 'quote/' + id)
  }

  searchAppName(name:String){
    return this.http.get<IRequest[]>(this.apiUrl + 'appointment/name/' + name)
  }

  searchPrevName(name:String){
    return this.http.get<IRequest[]>(this.apiUrl + 'quote/name/' + name)
  }

  putApp(el:IRequest, id:number){
    return this.http.put<IAppuntamento>(this.apiUrl + 'appointment/' + id, el)
  }

  putPrev(el:IRequest, id:number){
    return this.http.put<IPreventivo>(this.apiUrl + 'quote/' + id, el)
  }

  deleteApp(id:number){
    return this.http.delete<IAppuntamento>(this.apiUrl + 'appointment/' + id)
  }

  deletePrev(id:number){
    return this.http.delete<IPreventivo>(this.apiUrl + 'quote' + id)
  }

}
