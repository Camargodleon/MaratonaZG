import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GuiaComponent } from './guia/guia.component';
import { ConciliaComponent } from './concilia/concilia.component';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  { path: '/guias', component: GuiaComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    GuiaComponent,
    ConciliaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
