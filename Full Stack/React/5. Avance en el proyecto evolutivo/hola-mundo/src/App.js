import logo from './logo.svg';
import './App.css';
import Greetingf from './components/pure/greetingF';
import TaskListComponent from './components/container/task_list';
import Ejemplo1 from './hooks/Ejemplo1';
import Ejemplo2 from './hooks/Ejemplo2';
import MiComponenteConContexto from './hooks/Ejemplo3';
import Ejemplo4 from './hooks/Ejemplo4';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/* Componente propio greeting.jsx */}
        {/* <Greeting name="Tito"></Greeting> */}
        {/* Componente de ejemplo funcional */}
        {/* <Greetingf name="Tito"></Greetingf> */}
        {/* Componente de Listado de Tareas */}
        {/*<TaskListComponent></TaskListComponent>*/}
        {/*Ejemplos de uso de HOOKS */}
        {/*<Ejemplo1></Ejemplo1>*/}
        {/* <Ejemplo2></Ejemplo2> */}
        {/* <MiComponenteConContexto></MiComponenteConContexto> */}
        <Ejemplo4 nombre='Tito'>
          {/* Todo lo que hay aqui es tratado como props.children */}
          <h3>
            Contenido del props.children
          </h3>
        </Ejemplo4>
      </header>
    </div>
  );
}

export default App;
