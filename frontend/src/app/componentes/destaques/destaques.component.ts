import { Component, OnInit } from '@angular/core';
import { ProdutoService } from 'src/app/servicos/produto.service';

@Component({
  selector: 'app-destaques',
  templateUrl: './destaques.component.html',
  styleUrls: ['./destaques.component.css']
})
export class DestaquesComponent implements OnInit {

  //preciso injetar o serviço que busca o produto
  constructor(private service: ProdutoService) {

  }

  ngOnInit(): void {
    this.service.getAllProdutos()
      .subscribe(res => console.log(res), err => console.log(err));
  }
}
