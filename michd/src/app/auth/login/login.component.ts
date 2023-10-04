import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth-service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  @ViewChild('f') form!: NgForm;
  error: undefined | string;

  constructor(private authService: AuthService, private router: Router) { }
  ngOnInit(): void {
  }

  signAdmin(){
    if(this.form.value.username != ""
      && this.form.value.password != ""){
        this.authService.getAdmin()
        .subscribe((res)=>{

          if(res.username === this.form.value.username && res.password === this.form.value.password){
            this.router.navigate(['homeAdmin']);
          }


        },
        ((err)=>{
          alert("Accesso non consentito");
          this.router.navigate(['home'])
        }))
      }
    }

  }






