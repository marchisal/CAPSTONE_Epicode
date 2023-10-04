import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RichiestaAppuntamentoRoutingModule } from './richiesta-appuntamento-routing.module';
import { RichiestaAppuntamentoComponent } from './richiesta-appuntamento.component';
import { FormsModule, ReactiveFormsModule  } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    RichiestaAppuntamentoComponent
  ],
  imports: [
    CommonModule,
    RichiestaAppuntamentoRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [
    HttpClient,
  ]
})
export class RichiestaAppuntamentoModule { }
