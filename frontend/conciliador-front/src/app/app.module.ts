import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GuiaComponent } from './guia/guia.component';
import { ConciliaComponent } from './concilia/concilia.component';
import { AlimentaArquivosComponent } from './alimenta-arquivos/alimenta-arquivos.component';


@NgModule({
  declarations: [
    AppComponent,
    GuiaComponent,
    ConciliaComponent,
    AlimentaArquivosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
