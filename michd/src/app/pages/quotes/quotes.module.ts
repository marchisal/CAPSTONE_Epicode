import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { QuotesRoutingModule } from './quotes-routing.module';
import { QuotesComponent } from './quotes.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    QuotesComponent
  ],
  imports: [
    CommonModule,
    QuotesRoutingModule,
    NgbModule,
    FormsModule
  ]
})
export class QuotesModule { }
