# VendHub — Hub Inteligente de Gestão para Vendedores de Marketplace

> **Anuncie uma vez. Venda em todo lugar. Cresça com inteligência.**

---

## 📌 Visão Geral

O **VendHub** é uma plataforma SaaS B2B voltada para vendedores brasileiros que atuam simultaneamente em múltiplos marketplaces — como Mercado Livre e Shopee. A plataforma centraliza toda a operação de vendas em um único painel, eliminando o retrabalho manual e entregando inteligência competitiva em tempo real para que o vendedor tome decisões baseadas em dados.

---

## 🚨 O Problema

O Brasil possui mais de **10 milhões de vendedores ativos** em marketplaces. A grande maioria opera em dois ou mais canais simultaneamente e enfrenta diariamente os mesmos problemas:

- **Retrabalho operacional:** atualizar preço, estoque e descrição separadamente em cada marketplace consome horas por semana
- **Falta de diagnóstico:** o vendedor não sabe por que seus anúncios convertem pouco ou perdem para a concorrência
- **Decisões no feeling:** sem dados sobre concorrentes ou tendências de mercado, expansão de catálogo vira aposta
- **Margem invisível:** a maioria dos vendedores não sabe o lucro real de cada produto depois de descontar comissões, frete e custos

---

## 💡 A Solução

O VendHub resolve esses quatro problemas em uma plataforma integrada:

### 1. Hub de Publicação Centralizado
O vendedor cadastra o produto uma vez e publica automaticamente no Mercado Livre e Shopee simultaneamente. Qualquer atualização de preço, estoque ou descrição é feita em um único lugar e propagada para todos os canais em tempo real.

### 2. Diagnóstico Inteligente de Anúncios
O sistema analisa cada anúncio e gera um **score de qualidade de 0 a 100**, avaliando cinco dimensões: título, descrição, imagens, preço competitivo e estoque. Para cada ponto fraco encontrado, entrega sugestões acionáveis de melhoria. **Nenhum concorrente direto no mercado brasileiro oferece esse recurso.**

### 3. Precificação Dinâmica Baseada em Concorrência
O vendedor define o preço mínimo e máximo aceitável. O sistema monitora os concorrentes em tempo real e ajusta o preço automaticamente dentro dessa faixa, com estratégias configuráveis: menor preço, preço competitivo ou margem mínima garantida.

### 4. Descoberta de Oportunidades por Nicho
O sistema analisa categorias dos marketplaces identificando produtos com **alta demanda e baixa concorrência qualificada**, entregando ao vendedor um ranking de oportunidades para expansão de catálogo com score, margem estimada e nível de dificuldade de entrada. **Funcionalidade inexistente em qualquer concorrente pesquisado.**

---

## 🎯 Público-Alvo

**Perfil primário:** vendedores que faturam entre R$ 20.000 e R$ 200.000/mês, atuam em dois ou mais marketplaces e não possuem equipe de tecnologia própria.

**Perfil secundário:** pequenas operações de e-commerce com 1 a 5 colaboradores que buscam escalar sem aumentar custo operacional.

---

## 🔍 Análise Competitiva

| Funcionalidade | ANYMARKET | Plugg.To | UpSeller | Olist | VendHub |
|---|---|---|---|---|---|
| Publicação multichannel | ✅ | ✅ | ✅ | ✅ | ✅ |
| Precificação dinâmica | ✅ | ✅ | ❌ | ⚠️ | ✅ |
| Score diagnóstico de anúncio | ❌ | ❌ | ❌ | ❌ | **✅ exclusivo** |
| Descoberta de produtos por nicho | ❌ | ❌ | ❌ | ❌ | **✅ exclusivo** |
| Calculadora de margem real | ❌ | ✅ | ❌ | ⚠️ | ✅ |
| Gestão de SAC centralizado | ❌ | ✅ | ✅ | ❌ | ✅ |
| Foco no vendedor médio BR | ❌ | ⚠️ | ✅ | ⚠️ | **✅ principal** |
| Ticket acessível (< R$300/mês) | ❌ | ❌ | ✅ | ⚠️ | ✅ |

> ⚠️ Parcial · ✅ Sim · ❌ Não

**Vantagem competitiva central:** os dois maiores diferenciais do VendHub — diagnóstico com score e descoberta de nicho — estão **ausentes em todos os 6 concorrentes pesquisados**, incluindo os dois líderes nacionais (Olist e ANYMARKET).

---

## 💰 Modelo de Negócio

Assinatura mensal recorrente (SaaS B2B):

| Plano | Valor | Perfil |
|---|---|---|
| **Essencial** | R$ 97/mês | Até 100 produtos, 2 canais |
| **Profissional** | R$ 197/mês | Produtos ilimitados, todos os módulos |
| **Crescimento** | R$ 397/mês | Multi-usuário, relatórios avançados, API |

### Projeção de receita recorrente mensal (MRR):

| Clientes | Ticket médio | MRR |
|---|---|---|
| 50 | R$ 197 | R$ 9.850 |
| 200 | R$ 247 | R$ 49.400 |
| 500 | R$ 297 | R$ 148.500 |
| 2.000 | R$ 297 | R$ 594.000 |

---

## 📐 Arquitetura Técnica

### Stack
- **Backend:** Java 21 + Spring Boot 3.3 (Spring Security, Spring Data JPA, Spring Scheduler, WebClient)
- **Frontend:** React + TypeScript + Tailwind CSS
- **Banco de dados:** PostgreSQL 16
- **Cache:** Redis
- **Mensageria:** RabbitMQ
- **Infraestrutura:** AWS (EC2 + RDS) ou DigitalOcean

### Modelo de dados
O sistema possui **22 entidades** organizadas em 5 módulos:

```
Núcleo          → Empresa, Usuario
Catálogo        → Produto, ImagemProduto, Anuncio, KitProduto, PromocaoAgendada
Inteligência    → DiagnosticoAnuncio, Concorrente, HistoricoConcorrente,
                  HistoricoPreco, RegraPrecificacao, OportunidadeNicho
Operações       → Pedido, MovimentacaoEstoque, Avaliacao,
                  MensagemSac, RespostaAutomatica
Analytics       → MetricaAnuncio, CalculadoraMargem, RegraFrete, Notificacao
```

### Integrações planejadas
- **Fase 1 (MVP):** Mercado Livre API (OAuth 2.0) e Shopee Open Platform API
- **Fase 2:** Amazon SP-API, Magalu, Americanas/B2W
- **Fase 3:** Emissão de NF-e, logística (Melhor Envio, Loggi)

> As integrações de API foram intencionalmente separadas do MVP para garantir entrega funcional independente das aprovações de parceria com os marketplaces.

---

## 🗺️ Roadmap

### Sprint 1 — MVP (3 a 4 meses)
- [ ] Autenticação e gestão de empresas e usuários
- [ ] Cadastro de produtos e imagens
- [ ] Gestão de anúncios com score de qualidade
- [ ] Diagnóstico automático de anúncios
- [ ] Regras de precificação configuráveis
- [ ] Controle de estoque e movimentações
- [ ] Gestão de pedidos e avaliações
- [ ] Sistema de notificações

### Sprint 2 — Integrações (2 a 3 meses)
- [ ] Integração com Mercado Livre API
- [ ] Integração com Shopee API
- [ ] Sincronização automática de estoque e preço
- [ ] Publicação centralizada em tempo real

### Sprint 3 — Inteligência (2 a 3 meses)
- [ ] Monitoramento de concorrentes em tempo real
- [ ] Precificação dinâmica automatizada
- [ ] Módulo de descoberta de oportunidades por nicho
- [ ] Calculadora de margem real por canal
- [ ] Analytics avançado e relatórios

### Sprint 4 — Expansão (contínuo)
- [ ] Integração Amazon, Magalu e Americanas
- [ ] IA para geração de títulos e descrições
- [ ] Agentes de automação de SAC
- [ ] Emissão de NF-e integrada
- [ ] API pública para integrações externas

---

## 📊 Mercado e Oportunidade

| Indicador | Dado |
|---|---|
| Vendedores ativos em marketplaces no Brasil | 10+ milhões |
| Crescimento do e-commerce brasileiro (2024) | +15% ao ano |
| Ticket médio de ferramentas similares no mercado | R$ 197 a R$ 497/mês |
| Mercado de gestão multichannel LATAM projetado 2026 | ~R$ 2,4 bilhões |
| Concorrentes com diagnóstico de anúncio + descoberta de nicho | 0 de 6 pesquisados |

---

## 👤 Fundador

**Desenvolvedor solo** com experiência prática como vendedor em Mercado Livre e Shopee. A combinação de **visão técnica** (Java, Spring Boot, React, PostgreSQL) com **conhecimento de domínio real** do problema a ser resolvido representa a principal vantagem competitiva na fase de construção do produto.

- Experiência direta com os problemas que o produto resolve
- Capacidade de desenvolvimento full-stack independente
- Modelo de startup bootstrapped com custo operacional baixo

---

## 🏗️ Status Atual do Projeto

- [x] Validação do problema com experiência própria de mercado
- [x] Análise competitiva de 6 concorrentes diretos
- [x] Modelagem completa do banco de dados (22 entidades)
- [x] Definição de stack tecnológica
- [x] Roadmap de produto definido por sprints
- [x] Modelo de negócio e projeção de receita elaborados
- [ ] Desenvolvimento do MVP em andamento
- [ ] Primeiras integrações com APIs dos marketplaces
- [ ] Validação com clientes beta

---

## 📬 Contato

> Para mais informações sobre o projeto, proposta de parceria ou participação no programa de pré-aceleração, entre em contato:

- **E-mail:** seuemail@email.com
- **LinkedIn:** linkedin.com/in/seuperfil
- **GitHub:** github.com/seuusuario

---

*VendHub — Desenvolvido no Brasil para vendedores brasileiros.*
