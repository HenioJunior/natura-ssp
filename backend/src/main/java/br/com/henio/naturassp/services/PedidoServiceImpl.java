package br.com.henio.naturassp.services;

import br.com.henio.naturassp.dao.PedidoDAO;
import br.com.henio.naturassp.model.ItemPedido;
import br.com.henio.naturassp.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidoServiceImpl implements IPedidoService{

    @Autowired
    private PedidoDAO dao;

    @Override
    public Pedido inserirPedido(Pedido novo) {
        try {
        	double total = 0.0;
            /* aqui em tese vem a regra de negocios */
        	
        	for(ItemPedido item : novo.getItensPedido()) {
        		item.setPrecoUnitario(item.getProduto().getPreco());
        		System.out.println(item.getProduto().getNome());
        		System.out.println(item.getQtdeItem());
        		
        		if(item.getQtdeItem() >= 5) {
        			item.setPrecoTotal(item.getPrecoUnitario() * item.getQtdeItem() * 0.8);
        		} else {
        			item.setPrecoTotal(item.getPrecoUnitario() * item.getQtdeItem());
        		}
        		total += item.getPrecoTotal();
        	}

            /* ---- */
        	for(ItemPedido item: novo.getItensPedido()) {
        		item.setPedido(novo);
        	}
        	novo.setValorTotal(total);
            dao.save(novo);
            return novo;

        } catch (Exception ex) {
            System.out.println("----- PedidoService.inserirNovoPedido ---");
            ex.printStackTrace();
            System.out.println("------------------------------------");
        }
        return null;
    }
}

