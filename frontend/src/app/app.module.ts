import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { RodapeComponent } from './componentes/rodape/rodape.component';
import { DestaquesComponent } from './destaques/destaques.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    RodapeComponent,
    DestaquesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
