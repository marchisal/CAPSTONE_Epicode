import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RichiestaPreventivoRoutingModule } from './richiesta-preventivo-routing.module';
import { RichiestaPreventivoComponent } from './richiesta-preventivo.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    RichiestaPreventivoComponent
  ],
  imports: [
    CommonModule,
    RichiestaPreventivoRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [
    HttpClient,
  ]
})
export class RichiestaPreventivoModule { }
