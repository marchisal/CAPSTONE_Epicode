import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RichiestaPreventivoComponent } from './richiesta-preventivo.component';

const routes: Routes = [
  { path: '', component: RichiestaPreventivoComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RichiestaPreventivoRoutingModule { }
