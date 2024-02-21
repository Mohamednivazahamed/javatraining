import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OwnoneComponent } from './ownone/ownone.component';
import { PostComponent } from './crud/post/post.component';
import { FetchComponent } from './crud/fetch/fetch.component';
import { DeleteComponent } from './crud/delete/delete.component';
import { UpdateComponent } from './crud/update/update.component';
import { BindingComponent } from './binding/binding/binding.component';
const routes: Routes = [
  {path: 'get-product',component:PostComponent},
  {path: 'create-product',component:FetchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
