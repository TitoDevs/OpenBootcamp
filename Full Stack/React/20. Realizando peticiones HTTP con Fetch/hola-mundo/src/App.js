import logo from './logo.svg';
import './App.css';
import Greetingf from './components/pure/greetingF';
import TaskListComponent from './components/container/task_list';
import Ejemplo1 from './hooks/Ejemplo1';
import Ejemplo2 from './hooks/Ejemplo2';
import MiComponenteConContexto from './hooks/Ejemplo3';
import Ejemplo4 from './hooks/Ejemplo4';
import GreetingStyled from './components/pure/greetingStyled';
import Father from './components/container/father';
import OptionalRender from './components/pure/optionalRender';
import LoginFormik from './components/pure/forms/loginFormik';
import RegiterFormik from './components/pure/forms/regiterFormik';
import AsyncExample from './components/pure/AsyncExample';
import ObservableExample from './components/pure/ObservableExample';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/* Componente propio greeting.jsx */}
        {/* <Greeting name="Tito"></Greeting> */}
        {/* Componente de ejemplo funcional */}
        {/* <Greetingf name="Tito"></Greetingf> */}
        {/* Componente de Listado de Tareas */}
        {/* <TaskListComponent></TaskListComponent> */}
        {/*Ejemplos de uso de HOOKS */}
        {/*<Ejemplo1></Ejemplo1>*/}
        {/* <Ejemplo2></Ejemplo2> */}
        {/* <MiComponenteConContexto></MiComponenteConContexto> */}
        {/* <Ejemplo4 nombre='Tito'>
          {/* Todo lo que hay aqui es tratado como props.children *
          <h3>
            Contenido del props.children
          </h3>
        </Ejemplo4>
        <GreetingStyled name="TitoDev"></GreetingStyled>
      </header> */}
      {/* Gestion de eventos */}
      {/* <Father></Father> */}

      {/* Ejemplos de Renderizado condicional */}
      {/* <OptionalRender></OptionalRender> */}

      {/* Ejemplos de uso de Formik y Yup */}
      {/* <LoginFormik></LoginFormik> */}
      {/* <RegiterFormik></RegiterFormik> */}

      {/* Ejemplo de procesos asíncronos */}
      {/* <AsyncExample></AsyncExample> */}
      <ObservableExample></ObservableExample>
      {/* PROYECTO FINAL */}
      {/* <TaskListComponent></TaskListComponent> */}
    </div>
  );
}

export default App;
