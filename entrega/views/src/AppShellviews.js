import React,{Component } from 'react';
import PaginaInicial from './Paginainicial';
import Home from './Home';
import Destino from './Destino';
import Promoção from './Promoção';
import Contato from './Contato';
import { Switch,Route,Link } from 'react-router-dom';

class AppShell extends Component {
render() {
    return (
        <div>
       <header>
          <Link to="/PaginaInicial"> PaginaInicial </Link>
          <Link to="/Home"> Home </Link>
          <Link to="/Destino"> Destino </Link>
          <Link to="/Promoção"> Promoção </Link>
          <Link to="/Contato"> Contato </Link>
        </header>
        
        <main>
<Switch>
<Route path="/PaginaInicial" Component={PaginaInicial}/>
<Route path="/Home" Component={Home}/>
<Route path="/Destino" Component={Destino}/>
<Route path= "/Promoção" Component={Promoção}/>
<Route path= "/Contato" Component={Contato}/>
</Switch>
</main>
        
        <footer>
        made with love
        </footer>
        </div>
        );
        }
        }
        
        export default AppShell;
