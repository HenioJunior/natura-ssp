import { Categoria } from "./Categoria";

export class Produto {
    public id!: number;
    public nome!: string;
    public descricao!: string;
    public linkFoto!: string;
    public preco!: number;
    public disponivel!: number;
    public categoria!: Categoria;
}