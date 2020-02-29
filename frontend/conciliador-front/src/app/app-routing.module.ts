import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AlimentaArquivosComponent } from './alimenta-arquivos/alimenta-arquivos.component';


const routes: Routes = [
  { path: 'arquivo', component: AlimentaArquivosComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
