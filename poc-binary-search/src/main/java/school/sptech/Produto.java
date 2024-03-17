package school.sptech;

public class Produto {
    private int id;
    private String nome;
    private String desc;
    private double preco;
    private int qtdEstoque;

    public Produto(int id, String nome, String desc, double preco, int qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public Produto(int id, String nome, String desc, double preco) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
    }

    public Produto() {}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n");
        sb.append("------------ ID ").append(id).append(" ------------\n");
        sb.append("Nome: ").append(nome).append('\n');
        sb.append("Descrição: ").append(desc).append('\n');
        sb.append("Preco: R$ ").append(preco).append("\n");
        sb.append("Quantidade no Estoque: ").append(qtdEstoque).append("\n");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
