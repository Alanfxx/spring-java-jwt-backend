package alanfx.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import alanfx.cursomc.domain.Categoria;
import alanfx.cursomc.domain.Cidade;
import alanfx.cursomc.domain.Cliente;
import alanfx.cursomc.domain.Endereco;
import alanfx.cursomc.domain.Estado;
import alanfx.cursomc.domain.ItemPedido;
import alanfx.cursomc.domain.Pagamento;
import alanfx.cursomc.domain.PagamentoComBoleto;
import alanfx.cursomc.domain.PagamentoComCartao;
import alanfx.cursomc.domain.Pedido;
import alanfx.cursomc.domain.Produto;
import alanfx.cursomc.domain.enums.EstadoPagamento;
import alanfx.cursomc.domain.enums.Perfil;
import alanfx.cursomc.domain.enums.TipoCliente;
import alanfx.cursomc.repositories.CategoriaRepository;
import alanfx.cursomc.repositories.CidadeRepository;
import alanfx.cursomc.repositories.ClienteRepository;
import alanfx.cursomc.repositories.EnderecoRepository;
import alanfx.cursomc.repositories.EstadoRepository;
import alanfx.cursomc.repositories.ItemPedidoRepository;
import alanfx.cursomc.repositories.PagamentoRepository;
import alanfx.cursomc.repositories.PedidoRepository;
import alanfx.cursomc.repositories.ProdutoRepository;

@Service
public class DBService {
	@Autowired
	private CategoriaRepository categoriaRepository;	
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public void instantiateTestDatabase() throws ParseException {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Cama mesa e banho");
		Categoria cat4 = new Categoria(null, "Eletrônicos");
		Categoria cat5 = new Categoria(null, "Jardinagem");
		Categoria cat6 = new Categoria(null, "Decoração");
		Categoria cat7 = new Categoria(null, "Perfumaria");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Roçadeira", 800.00);
		Produto p5 = new Produto(null, "Mesa de escritório", 300.00);
		Produto p6 = new Produto(null, "Toalha", 50.00);
		Produto p7 = new Produto(null, "Colcha", 200.00);
		Produto p8 = new Produto(null, "TV true color", 1200.00);
		Produto p9 = new Produto(null, "Abajour", 100.00);
		Produto p10 = new Produto(null, "Pendente", 180.00);
		Produto p11 = new Produto(null, "Shampoo", 90.00);
//-----------
		Produto p12 = new Produto(null, "Produto 12", 10.00);
		Produto p13 = new Produto(null, "Produto 13", 10.00);
		Produto p14 = new Produto(null, "Produto 14", 10.00);
		Produto p15 = new Produto(null, "Produto 15", 10.00);
		Produto p16 = new Produto(null, "Produto 16", 10.00);
		Produto p17 = new Produto(null, "Produto 17", 10.00);
		Produto p18 = new Produto(null, "Produto 18", 10.00);
		Produto p19 = new Produto(null, "Produto 19", 10.00);
		Produto p20 = new Produto(null, "Produto 20", 10.00);
		Produto p21 = new Produto(null, "Produto 21", 10.00);
		Produto p22 = new Produto(null, "Produto 22", 10.00);
		Produto p23 = new Produto(null, "Produto 23", 10.00);
		Produto p24 = new Produto(null, "Produto 24", 10.00);
		Produto p25 = new Produto(null, "Produto 25", 10.00);
		Produto p26 = new Produto(null, "Produto 26", 10.00);
		Produto p27 = new Produto(null, "Produto 27", 10.00);
		Produto p28 = new Produto(null, "Produto 28", 10.00);
		Produto p29 = new Produto(null, "Produto 29", 10.00);
		Produto p30 = new Produto(null, "Produto 30", 10.00);
		Produto p31 = new Produto(null, "Produto 31", 10.00);
		Produto p32 = new Produto(null, "Produto 32", 10.00);
		Produto p33 = new Produto(null, "Produto 33", 10.00);
		Produto p34 = new Produto(null, "Produto 34", 10.00);
		Produto p35 = new Produto(null, "Produto 35", 10.00);
		Produto p36 = new Produto(null, "Produto 36", 10.00);
		Produto p37 = new Produto(null, "Produto 37", 10.00);
		Produto p38 = new Produto(null, "Produto 38", 10.00);
		Produto p39 = new Produto(null, "Produto 39", 10.00);
		Produto p40 = new Produto(null, "Produto 40", 10.00);
		Produto p41 = new Produto(null, "Produto 41", 10.00);
		Produto p42 = new Produto(null, "Produto 42", 10.00);
		Produto p43 = new Produto(null, "Produto 43", 10.00);
		Produto p44 = new Produto(null, "Produto 44", 10.00);
		Produto p45 = new Produto(null, "Produto 45", 10.00);
		Produto p46 = new Produto(null, "Produto 46", 10.00);
		Produto p47 = new Produto(null, "Produto 47", 10.00);
		Produto p48 = new Produto(null, "Produto 48", 10.00);
		Produto p49 = new Produto(null, "Produto 49", 10.00);
		Produto p50 = new Produto(null, "Produto 50", 10.00);
		
//		cat1.getProdutos().addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
//		p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
//		p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		p12.setCategorias(Arrays.asList(cat1));
		p13.setCategorias(Arrays.asList(cat1));
		p14.setCategorias(Arrays.asList(cat1));
		p15.setCategorias(Arrays.asList(cat1));
		p16.setCategorias(Arrays.asList(cat1));
		p17.setCategorias(Arrays.asList(cat1));
		p18.setCategorias(Arrays.asList(cat1));
		p19.setCategorias(Arrays.asList(cat1));
		p20.setCategorias(Arrays.asList(cat1));
		p21.setCategorias(Arrays.asList(cat1));
		p22.setCategorias(Arrays.asList(cat1));
		p23.setCategorias(Arrays.asList(cat1));
		p24.setCategorias(Arrays.asList(cat1));
		p25.setCategorias(Arrays.asList(cat1));
		p26.setCategorias(Arrays.asList(cat1));
		p27.setCategorias(Arrays.asList(cat1));
		p28.setCategorias(Arrays.asList(cat1));
		p29.setCategorias(Arrays.asList(cat1));
		p30.setCategorias(Arrays.asList(cat1));
		p31.setCategorias(Arrays.asList(cat1));
		p32.setCategorias(Arrays.asList(cat1));
		p33.setCategorias(Arrays.asList(cat1));
		p34.setCategorias(Arrays.asList(cat1));
		p35.setCategorias(Arrays.asList(cat1));
		p36.setCategorias(Arrays.asList(cat1));
		p37.setCategorias(Arrays.asList(cat1));
		p38.setCategorias(Arrays.asList(cat1));
		p39.setCategorias(Arrays.asList(cat1));
		p40.setCategorias(Arrays.asList(cat1));
		p41.setCategorias(Arrays.asList(cat1));
		p42.setCategorias(Arrays.asList(cat1));
		p43.setCategorias(Arrays.asList(cat1));
		p44.setCategorias(Arrays.asList(cat1));
		p45.setCategorias(Arrays.asList(cat1));
		p46.setCategorias(Arrays.asList(cat1));
		p47.setCategorias(Arrays.asList(cat1));
		p48.setCategorias(Arrays.asList(cat1));
		p49.setCategorias(Arrays.asList(cat1));
		p50.setCategorias(Arrays.asList(cat1));
//-----------
		
		p1.setCategorias(Arrays.asList(cat1, cat4));
		p2.setCategorias(Arrays.asList(cat1, cat2, cat4));
		p3.setCategorias(Arrays.asList(cat1, cat4));
		p4.setCategorias(Arrays.asList(cat2));
		p5.setCategorias(Arrays.asList(cat3));
		p6.setCategorias(Arrays.asList(cat3));
		p7.setCategorias(Arrays.asList(cat4));
		p8.setCategorias(Arrays.asList(cat5));
		p9.setCategorias(Arrays.asList(cat6));
		p10.setCategorias(Arrays.asList(cat6));
		p11.setCategorias(Arrays.asList(cat7));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
		produtoRepository.saveAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
	
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		//=============
		Cliente cli1 = new Cliente(null, "Jose Alan", "j.alands2@gmail.com", "04005700500", TipoCliente.PESSOAFISICA, pe.encode("1234"));
		Set<String> tels = new HashSet<String>();
		tels.addAll(Arrays.asList("27363323","93838393"));
		cli1.setTelefones(tels);
		cli1.addPerfil(Perfil.ADMIN);
		
		Cliente cli2 = new Cliente(null, "Ana Paula", "jose.asilva@dcomp.ufs.br", "25339686094", TipoCliente.PESSOAFISICA, pe.encode("123"));
		Set<String> tels2 = new HashSet<String>();
		tels2.addAll(Arrays.asList("4654646636","9463215145"));
		cli2.setTelefones(tels2);
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 203", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Saia 800", "Centro", "38777012", cli1, c2);
		Endereco e3 = new Endereco(null, "Avenida Floriano", "2106", null, "Centro", "99977012", cli2, c2);
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3));
		
		//==============
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO,ped1 , 6);
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped1.setPagamento(pagto1);
		ped2.setPagamento(pagto2);
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
		
		//===============
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
	}
}
