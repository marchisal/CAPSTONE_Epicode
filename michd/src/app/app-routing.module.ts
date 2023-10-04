import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'landing', loadChildren: () => import('./pages/landing/landing.module').then(m => m.LandingModule) },
  { path: 'home', loadChildren: () => import('./pages/home/home.module').then(m => m.HomeModule) },
  { path: 'homeAdmin', loadChildren: () => import('./pages/home-admin/home-admin.module').then(m => m.HomeAdminModule) },
  { path: 'appointments', loadChildren: () => import('./pages/appointments/appointments.module').then(m => m.AppointmentsModule) },
  { path: 'quotes', loadChildren: () => import('./pages/quotes/quotes.module').then(m => m.QuotesModule) },
  { path: 'richiestaPreventivo/:id', loadChildren: () => import('./pages/richiesta-preventivo/richiesta-preventivo.module').then(m => m.RichiestaPreventivoModule) },
  { path: 'richiestaAppuntamento/:id', loadChildren: () => import('./pages/richiesta-appuntamento/richiesta-appuntamento.module').then(m => m.RichiestaAppuntamentoModule) }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
