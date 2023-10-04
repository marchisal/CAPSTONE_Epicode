import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthComponent } from './auth.component';

const routes: Routes = [{ path: '', component: AuthComponent },
  { path: 'login', loadChildren: () => import('../auth/login/login.module').then(m => m.LoginModule) },
  { path: 'home', loadChildren: () => import('../pages/home/home.module').then(m => m.HomeModule) },
  { path: 'homeAdmin', loadChildren: () => import('../pages/home-admin/home-admin.module').then(m => m.HomeAdminModule) }

  ];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
