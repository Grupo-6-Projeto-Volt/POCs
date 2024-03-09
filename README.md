# POC's 📝

### ⚠️🚨 Cada Projeto criado dentro deste repositório representa uma POC

>[!NOTE]
> **Linguagem: JAVA**;
>
> **JDK**: 17 (17.0.6);
>
> **Build System**: Maven;
>
> **GroupId**: school.sptech;
>
> **Depenências**: Sem dependências desde a última atualização;

#### POCS de ordenação: geração vetores int e dobule, foi usado esse código de apoio desenvolvido em Python

```py
import random
import decimal

numeros_aleatorios = []

def gerar_numeros_aleatorios_int(qtd_numeros, inicio_intervalo, fim_intervalo):
    for _ in range(qtd_numeros):
        numero_aleatorio = random.randint(inicio_intervalo, fim_intervalo)
        numeros_aleatorios.append(numero_aleatorio)
    return numeros_aleatorios

def gerar_numeros_aleatorios_double(qtd_numeros, inicio_intervalo, fim_intervalo):
    for _ in range(qtd_numeros):
        numero_aleatorio = random.randrange(inicio_intervalo, fim_intervalo)/100
        numeros_aleatorios.append(numero_aleatorio)
    
    return numeros_aleatorios

# Gerando 1000 numeros inteiros de 1 ate 10 mil.
# numeros_aleatorios = gerar_numeros_aleatorios_int(1000, 1, 10000)
numeros_aleatorios = gerar_numeros_aleatorios_double(1000, 1, 1000)

print("Números aleatórios gerados:")
print(numeros_aleatorios)
```

### [POC Bubble Sort](https://github.com/Grupo-6-Projeto-Volt/POCs/tree/main/poc-bobble-sort)
- Tempo de execução:
    - Vetor `int`: ~5 Milissegundos;
    - Vetor `double`: ~7 Milissegundos;  
- [x] Ordenação de veores do tipo `int`;
- [x] Ordenação de vetores do tipo `double`;

### [POC Selection Sort](https://github.com/Grupo-6-Projeto-Volt/POCs/tree/main/poc-selection-sort)
- Tempo de execução
    - Vetor `int`: ~ 3 Milissegundos;
    - Vetor `double`: ~ 2 Milissegundos;
- [x] Ordenação de veores do tipo `int`;
- [x] Ordenação de vetores do tipo `double`;
- [ ] Ordenação de vetores do tipo `String`;
