AgênciaApi.Endpoints;

internal class Program
{
    private static void Main(string[] args)
    {
        var builder = WebApplication.CreateBuilder(args);

        // Add services to the container.
        // Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
        builder.Services.AddEndpointsApiExplorer();
        builder.Services.AddSwaggerGen();

        var app = builder.Build();

        // Configure the HTTP request pipeline.
        if (app.Environment.IsDevelopment())
        {
            app.UseSwagger();
            app.UseSwaggerUI();
        }

        app.UseHttpsRedirection();

        app.MapMethods(ClienteGet.Template, ClienteGet.Metodo, ClienteGet.Func);
        app.MapMethods(DestinoGet.Template, DestinoGet.Metodo, DestinoGet.Func);
        app.MapMethods(ClasseGet.Template, ClasseGet.Metodo, ClasseGet.Func);
        app.MapMethods(PassageiroGet.Template, PassageiroGet.Metodo, ClasseGet.Func);
        app.MapMethods(PeriodoGet.Template, PeriodoGet.Metodo, ClasseGet.Func);



        app.Run();