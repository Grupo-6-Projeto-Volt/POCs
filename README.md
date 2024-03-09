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

#### Para geração de números inteiros para os vetores, foi usado esse código de apoio desenvolvido em Python

```py
import random

def gerar_numeros_aleatorios_int(qtd_numeros, inicio_intervalo, fim_intervalo):
    numeros_aleatorios = []
    for _ in range(qtd_numeros):
        numero_aleatorio = random.randint(inicio_intervalo, fim_intervalo)
        numeros_aleatorios.append(numero_aleatorio)
    return numeros_aleatorios

# Gerando 1000 numeros inteiros de 1 ate 10 mil.
numeros_aleatorios = gerar_numeros_aleatorios_int(1000, 1, 10000)

print("Números aleatórios gerados:")
print(numeros_aleatorios)
```

---

### [POC Bubble Sort](https://github.com/Grupo-6-Projeto-Volt/POCs/tree/main/poc-bobble-sort)
O Bubble Sort é um algoritmo de ordenação simples e eficaz em alguns casos. Conta com:
- Marcador de tempo de execução do metódo; 
- Ordenação de veores do tipo `int`; Testado e validado: ✅
- Ordenação de vetores do tipo `double`; Testado e validado: ❌

### POC Selection Sort - EM PROGESSO 🚧🏗️
