package bean;
// Generated 13/11/2023 10:03:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VeccVenda generated by hbm2java
 */
@Entity
@Table(name="vecc_venda"
    ,catalog="db_victor_cardoso"
)
public class VeccVenda  implements java.io.Serializable {


     private int veccIdvenda;
     private VeccVendedor veccVendedor;
     private String veccDestinatario;
     private String veccEndereco;
     private String veccProduto;
     private String veccPreco;

    public VeccVenda() {
    }

	
    public VeccVenda(int veccIdvenda, VeccVendedor veccVendedor) {
        this.veccIdvenda = veccIdvenda;
        this.veccVendedor = veccVendedor;
    }
    public VeccVenda(int veccIdvenda, VeccVendedor veccVendedor, String veccDestinatario, String veccEndereco, String veccProduto, String veccPreco) {
       this.veccIdvenda = veccIdvenda;
       this.veccVendedor = veccVendedor;
       this.veccDestinatario = veccDestinatario;
       this.veccEndereco = veccEndereco;
       this.veccProduto = veccProduto;
       this.veccPreco = veccPreco;

    }
   
     @Id 

    
    @Column(name="vecc_idvenda", unique=true, nullable=false)
    public int getVeccIdvenda() {
        return this.veccIdvenda;
    }
    
    public void setVeccIdvenda(int veccIdvenda) {
        this.veccIdvenda = veccIdvenda;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vecc_fk_vendedor", nullable=false)
    public VeccVendedor getVeccVendedor() {
        return this.veccVendedor;
    }
    
    public void setVeccVendedor(VeccVendedor veccVendedor) {
        this.veccVendedor = veccVendedor;
    }

    
    @Column(name="vecc_destinatario", length=45)
    public String getVeccDestinatario() {
        return this.veccDestinatario;
    }
    
    public void setVeccDestinatario(String veccDestinatario) {
        this.veccDestinatario = veccDestinatario;
    }

    
    @Column(name="vecc_endereco", length=45)
    public String getVeccEndereco() {
        return this.veccEndereco;
    }
    
    public void setVeccEndereco(String veccEndereco) {
        this.veccEndereco = veccEndereco;
    }

    
    @Column(name="vecc_produto", length=45)
    public String getVeccProduto() {
        return this.veccProduto;
    }
    
    public void setVeccProduto(String veccProduto) {
        this.veccProduto = veccProduto;
    }

    
    @Column(name="vecc_preco", length=45)
    public String getVeccPreco() {
        return this.veccPreco;
    }
    
    public void setVeccPreco(String veccPreco) {
        this.veccPreco = veccPreco;
    }
}


