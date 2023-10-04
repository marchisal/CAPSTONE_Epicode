import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'richiestaAppuntamento', loadChildren: () => import('../richiesta-appuntamento/richiesta-appuntamento.module').then(m => m.RichiestaAppuntamentoModule) },
  { path: 'richiestaPreventivo', loadChildren: () => import('../richiesta-preventivo/richiesta-preventivo.module').then(m => m.RichiestaPreventivoModule) },
  { path: 'auth', loadChildren: () => import('../../auth/auth.module').then(m => m.AuthModule) }
  ];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }

