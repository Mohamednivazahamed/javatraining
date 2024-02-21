import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding/binding.component';
import { FormsModule, NgModel } from '@angular/forms';
import { OwnoneComponent } from './ownone/ownone.component';
import { HttpComponent } from './http/http.component';
import { HttpClientModule } from '@angular/common/http';
import { PostComponent } from './crud/post/post.component';
import { UpdateComponent } from './crud/update/update.component';
import { DeleteComponent } from './crud/delete/delete.component';
import { FetchComponent } from './crud/fetch/fetch.component';

@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    OwnoneComponent,
    HttpComponent,
    PostComponent,
    UpdateComponent,
    DeleteComponent,
    FetchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
