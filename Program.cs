using ConsumindoApiAgencia.entities;
using ConsumindoApiAgencia.Services;
using System;
using System.Security.Cryptography.X509Certificates;

namespace ConsumindoApiAgencia
{
    class Program
    {
        public static async Task Main(string[] args)
        {
            Console.WriteLine("informe o id: ");
            int id = int.Parse(Console.ReadLine());

            ClienteServices clienteServices = new ClienteServices();
            Cliente clienteEncontrado = await clienteServices.Integracao(id);

            if (!clienteEncontrado.Vericacao)
            {
                Console.WriteLine("cliente Encontrado!");

                Console.WriteLine("Nome: " + clienteEncontrado.Name);
                Console.WriteLine("Email: " + clienteEncontrado.Email);
                Console.WriteLine("Cpf: " + clienteEncontrado.Cpf);
                Console.WriteLine("Nasc: " + clienteEncontrado.Nasc);
                Console.WriteLine("Contato: " + clienteEncontrado.Contato);
                Console.WriteLine("Endereco: " + clienteEncontrado.Endereco);
               

            }
            else
                Console.WriteLine("cliente nao Encontrado");


            Console.WriteLine("informe o id: ");
            int id = int.Parse(Console.ReadLine());

            DestinoServices destinoServices = new DestinoServices();
            Destino destinoEncontrado = await destinoServices.Integracao(id);

            if (!destinoEncontrado.Vericacao)
            {
                Console.WriteLine("destino Encontrado!");

                Console.WriteLine("Ida: " + destinoEncontrado.Ida);
                Console.WriteLine("IdaVolta: " + destinoEncontrado.IdaVolta);
                Console.WriteLine("Multidestino: " + destinoEncontrado.Multidestino);



            }
            else
                Console.WriteLine("destino nao Encontrado");


            Console.WriteLine("informe o id: ");
            int id = int.Parse(Console.ReadLine());

            ClasseServices classeServices = new ClasseServices();
            Classe classeEncontrado = await classeServices.Integracao(id);

            if (!classeEncontrado.Vericacao)
            {
                Console.WriteLine("classe Encontrado!");

                Console.WriteLine("Economica: " + classeEncontrado.Economica);
                Console.WriteLine("ExecutivaBussines: " + classeEncontrado.ExecutivaBussines);
                Console.WriteLine("PrimeiraClasse: " + classeEncontrado.PrimeiraClasse);
                Console.WriteLine("PremiumEconomica " + classeEncontrado.PremiumEconomica);


            }
            else
                Console.WriteLine("classe nao Encontrada");

            Console.WriteLine("informe o id: ");
            int id = int.Parse(Console.ReadLine());

            PassageiroServices passageiroServices = new PassageiroServices();
            Passageiro passageiroEncontrado = await passageiroServices.Integracao(id);

            if (!passageiroEncontrado.Vericacao)
            {
                Console.WriteLine("passageiro Encontrado!");

                Console.WriteLine("Adulto: " + passageiroEncontrado.Adulto);
                Console.WriteLine("Menores: " + passageiroEncontrado.Menores);
                Console.WriteLine("Idade: " + passageiroEncontrado.Idade);



            }
            else
                Console.WriteLine("passageiro nao Encontrado");


            Console.WriteLine("informe o id: ");
            int id = int.Parse(Console.ReadLine());

            PeriodoServices periodoServices = new PeriodoServices();
            Periodo periodoEncontrado = await periodoServices.Integracao(id);

            if (!periodoEncontrado.Vericacao)
            {
                Console.WriteLine("periodo Encontrado!");

                Console.WriteLine("DuracaoViagem: " + periodoEncontrado.DuracaoViagem);




            }
            else
                Console.WriteLine(" periodo nao Encontrado");
        } 
    }

}






