CREATE TABLE Caixa (
  Cod_caixa INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Saldo_inicial DOUBLE NULL,
  Data_caixa DATE NULL,
  Hora TIME NULL,
  abertura_fechamento VARCHAR(20) NULL,
  Observacoes VARCHAR(100) NULL,
  Descricao VARCHAR(100) NULL,
  Entradas DOUBLE NULL,
  Saidas DOUBLE NULL,
  Saldo_final DOUBLE NULL,
  PRIMARY KEY(Cod_caixa)
);

CREATE TABLE Cardapio_digital (
  Num_prato INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Produto_Cod_produto INTEGER UNSIGNED NOT NULL,
  Preco DOUBLE NULL,
  nome VARCHAR(100) NULL,
  Descricao VARCHAR(100) NULL,
  PRIMARY KEY(Num_prato),
  INDEX Cardapio_digital_FKIndex1(Produto_Cod_produto)
);

CREATE TABLE Clientes (
  Cod_clientes INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Principal_Cod_principal INTEGER UNSIGNED NOT NULL,
  nome VARCHAR(100) NULL,
  Telefone VARCHAR(15) NULL,
  Endereco VARCHAR(100) NULL,
  E-mail VARCHAR(100) NULL,
  qtd_pedidos INTEGER UNSIGNED NULL,
  PRIMARY KEY(Cod_clientes),
  INDEX Clientes_FKIndex1(Principal_Cod_principal)
);

CREATE TABLE Clientes_has_Pedidos_caixa (
  Clientes_Cod_clientes INTEGER UNSIGNED NOT NULL,
  Pedidos_caixa_Cod_pedcaixa INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Clientes_Cod_clientes, Pedidos_caixa_Cod_pedcaixa),
  INDEX Clientes_has_Pedidos_caixa_FKIndex1(Clientes_Cod_clientes),
  INDEX Clientes_has_Pedidos_caixa_FKIndex2(Pedidos_caixa_Cod_pedcaixa)
);

CREATE TABLE Clientes_has_Pedidos_delivery (
  Clientes_Cod_clientes INTEGER UNSIGNED NOT NULL,
  Pedidos_delivery_Num_pedido INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Clientes_Cod_clientes, Pedidos_delivery_Num_pedido),
  INDEX Clientes_has_Pedidos_delivery_FKIndex1(Clientes_Cod_clientes),
  INDEX Clientes_has_Pedidos_delivery_FKIndex2(Pedidos_delivery_Num_pedido)
);

CREATE TABLE Contas (
  Cod_contas INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Financeiro_Cod_financeiro INTEGER UNSIGNED NOT NULL,
  Vencimento DATE NULL,
  Pagamento DATE NULL,
  Nome_fornecedor VARCHAR(100) NULL,
  Categoria VARCHAR(50) NULL,
  descricao VARCHAR(100) NULL,
  valor_total DOUBLE NULL,
  tipo VARCHAR(20) NULL,
  Forma_pagamento VARCHAR(50) NULL,
  PRIMARY KEY(Cod_contas),
  INDEX Contas_FKIndex1(Financeiro_Cod_financeiro)
);

CREATE TABLE Contas_has_Pedidos_delivery (
  Contas_Cod_contas INTEGER UNSIGNED NOT NULL,
  Pedidos_delivery_Num_pedido INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Contas_Cod_contas, Pedidos_delivery_Num_pedido),
  INDEX Contas_has_Pedidos_delivery_FKIndex1(Contas_Cod_contas),
  INDEX Contas_has_Pedidos_delivery_FKIndex2(Pedidos_delivery_Num_pedido)
);

CREATE TABLE Estoque (
  Cod_estoque INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Produto_Cod_produto INTEGER UNSIGNED NOT NULL,
  Modelo VARCHAR(20) NULL,
  Cor VARCHAR(20) NULL,
  Tamanho VARCHAR(20) NULL,
  qtd INTEGER UNSIGNED NULL,
  valor_unidade DOUBLE NULL,
  total DOUBLE NULL,
  PRIMARY KEY(Cod_estoque),
  INDEX Estoque_FKIndex1(Produto_Cod_produto)
);

CREATE TABLE Financeiro (
  Cod_financeiro INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Resumo_financeiro_Cod_resumofinanc INTEGER UNSIGNED NOT NULL,
  Setores_Cod_setor INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Cod_financeiro),
  INDEX Financeiro_FKIndex1(Setores_Cod_setor),
  INDEX Financeiro_FKIndex2(Resumo_financeiro_Cod_resumofinanc)
);

CREATE TABLE Fornecedores (
  CPF_CNPJ VARCHAR(20) NOT NULL AUTO_INCREMENT,
  Financeiro_Cod_financeiro INTEGER UNSIGNED NOT NULL,
  Nome VARCHAR(100) NULL,
  E-mail VARCHAR(50) NULL,
  Telefone VARCHAR(15)) NULL,
  nome_produto VARCHAR(100) NULL,
  PRIMARY KEY(CPF_CNPJ),
  INDEX Fornecedores_FKIndex1(Financeiro_Cod_financeiro)
);

CREATE TABLE Fornecedores_has_Contas (
  Fornecedores_CPF_CNPJ VARCHAR(20) NOT NULL,
  Contas_Cod_contas INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Fornecedores_CPF_CNPJ, Contas_Cod_contas),
  INDEX Fornecedores_has_Contas_FKIndex1(Fornecedores_CPF_CNPJ),
  INDEX Fornecedores_has_Contas_FKIndex2(Contas_Cod_contas)
);

CREATE TABLE Fornecedores_has_Itens (
  Fornecedores_CPF_CNPJ VARCHAR(20) NOT NULL,
  Itens_Cod_itens INTEGER UNSIGNED NOT NULL,
  Itens_Produto_Cod_produto INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Fornecedores_CPF_CNPJ, Itens_Cod_itens, Itens_Produto_Cod_produto),
  INDEX Fornecedores_has_Itens_FKIndex1(Fornecedores_CPF_CNPJ),
  INDEX Fornecedores_has_Itens_FKIndex2(Itens_Cod_itens, Itens_Produto_Cod_produto)
);

CREATE TABLE Funcionários (
  Cod_func INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Setores_Cod_setor INTEGER UNSIGNED NOT NULL,
  Nome VARCHAR(100) NULL,
  E-mail VARCHAR(100) NULL,
  Telefone VARCHAR(15) NULL,
  Sexo VARCHAR(15) NULL,
  Nome_de_usuario VARCHAR(30) NULL,
  Senha VARCHAR(10) NULL,
  Tipo VARCHAR(15) NULL,
  Salario DOUBLE NULL,
  PRIMARY KEY(Cod_func),
  INDEX Funcionários_FKIndex1(Setores_Cod_setor)
);

CREATE TABLE Insumos (
  Cod_insumos INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Itens_Produto_Cod_produto INTEGER UNSIGNED NOT NULL,
  Itens_Cod_itens INTEGER UNSIGNED NOT NULL,
  categoria VARCHAR(50) NULL,
  Preco DOUBLE NULL,
  medida VARCHAR(20) NULL,
  qtd INTEGER UNSIGNED NULL,
  tipo VARCHAR(50) NULL,
  valor_compra DOUBLE NULL,
  PRIMARY KEY(Cod_insumos),
  INDEX Insumos_FKIndex1(Itens_Cod_itens, Itens_Produto_Cod_produto)
);

CREATE TABLE Itens (
  Cod_itens INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Produto_Cod_produto INTEGER UNSIGNED NOT NULL,
  Clientes_Cod_clientes INTEGER UNSIGNED NOT NULL,
  Nome VARCHAR(100) NULL,
  categoria VARCHAR(50) NULL,
  preco_custo DOUBLE NULL,
  preco_venda DOUBLE NULL,
  medida VARCHAR(20) NULL,
  PRIMARY KEY(Cod_itens, Produto_Cod_produto),
  INDEX Itens_FKIndex1(Clientes_Cod_clientes),
  INDEX Itens_FKIndex2(Produto_Cod_produto)
);

CREATE TABLE Itens_has_Estoque (
  Itens_Cod_itens INTEGER UNSIGNED NOT NULL,
  Estoque_Cod_estoque INTEGER UNSIGNED NOT NULL,
  Itens_Produto_Cod_produto INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Itens_Cod_itens, Estoque_Cod_estoque, Itens_Produto_Cod_produto),
  INDEX Itens_has_Estoque_FKIndex1(Itens_Cod_itens, Itens_Produto_Cod_produto),
  INDEX Itens_has_Estoque_FKIndex2(Estoque_Cod_estoque)
);

CREATE TABLE Pedidos_caixa (
  Cod_pedcaixa INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Principal_Cod_principal INTEGER UNSIGNED NOT NULL,
  Tempo TIME NULL,
  Atendente VARCHAR(100) NULL,
  Observaacoe VARCHAR(100) NULL,
  Nome_cliente VARCHAR(100)) NULL,
  Total DOUBLE NULL,
  PRIMARY KEY(Cod_pedcaixa),
  INDEX Pedidos_caixa_FKIndex1(Principal_Cod_principal)
);

CREATE TABLE Pedidos_caixa_has_Pedidos_delivery (
  Pedidos_caixa_Cod_pedcaixa INTEGER UNSIGNED NOT NULL,
  Pedidos_delivery_Num_pedido INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Pedidos_caixa_Cod_pedcaixa, Pedidos_delivery_Num_pedido),
  INDEX Pedidos_caixa_has_Pedidos_delivery_FKIndex1(Pedidos_caixa_Cod_pedcaixa),
  INDEX Pedidos_caixa_has_Pedidos_delivery_FKIndex2(Pedidos_delivery_Num_pedido)
);

CREATE TABLE Pedidos_delivery (
  Num_pedido INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Abertura TIME NULL,
  Duracao TIME NULL,
  Nome_cliente VARCHAR(100) NULL,
  Pedido VARCHAR(100) NULL,
  Total_sem_taxas DOUBLE NULL,
  Total DOUBLE NULL,
  PRIMARY KEY(Num_pedido)
);

CREATE TABLE Principal (
  Cod_principal INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Funcionários_Cod_func INTEGER UNSIGNED NOT NULL,
  Pedidos_delivery_Num_pedido INTEGER UNSIGNED NOT NULL,
  Caixa_Cod_caixa INTEGER UNSIGNED NOT NULL,
  Setores_Cod_setor INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Cod_principal),
  INDEX Principal_FKIndex1(Setores_Cod_setor),
  INDEX Principal_FKIndex2(Caixa_Cod_caixa),
  INDEX Principal_FKIndex3(Pedidos_delivery_Num_pedido),
  INDEX Principal_FKIndex4(Funcionários_Cod_func)
);

CREATE TABLE Produto (
  Cod_produto INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Insumos_Cod_insumos INTEGER UNSIGNED NOT NULL,
  Setores_Cod_setor INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Cod_produto),
  INDEX Produto_FKIndex1(Setores_Cod_setor),
  INDEX Produto_FKIndex2(Insumos_Cod_insumos)
);

CREATE TABLE Resumo_financeiro (
  Cod_resumofinanc INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  data_resumo DATE NULL,
  valor_recebido DOUBLE NULL,
  valor_pagar DOUBLE NULL,
  valor_pago DOUBLE NULL,
  Saldo_previsto DOUBLE NULL,
  Saida_realizada DOUBLE NULL,
  PRIMARY KEY(Cod_resumofinanc)
);

CREATE TABLE Setores (
  Cod_setor INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Gerente VARCHAR(100) NULL,
  Nome VARCHAR(100) NULL,
  PRIMARY KEY(Cod_setor)
);


