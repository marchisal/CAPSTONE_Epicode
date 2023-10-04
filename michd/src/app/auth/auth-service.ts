import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import { environment } from 'src/environments/environment.development';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { IRegister } from '../interface/iregister';
import { BehaviorSubject, catchError, map, tap, throwError } from 'rxjs';
import { ILogin } from '../interface/ilogin';
import { IAuthData } from '../interface/iauth-data';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  apiUrl = environment.url
  loginUrl = this.apiUrl + 'admin/1'
  loggedIn: boolean = false;

  jwtHelper:JwtHelperService = new JwtHelperService()

  constructor(private http:HttpClient, private router:Router) { }



 getAdmin(){
  return this.http.get<ILogin>(this.loginUrl)
 }



}
