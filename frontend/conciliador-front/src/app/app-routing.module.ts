import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GuiaComponent } from './guia/guia.component';


const routes: Routes = [
  { path: '/guias', component: GuiaComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
