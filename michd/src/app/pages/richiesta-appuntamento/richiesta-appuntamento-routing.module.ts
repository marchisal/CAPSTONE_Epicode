import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RichiestaAppuntamentoComponent } from './richiesta-appuntamento.component';

const routes: Routes = [
  { path: '', component: RichiestaAppuntamentoComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RichiestaAppuntamentoRoutingModule { }
