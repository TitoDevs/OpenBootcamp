import logo from './logo.svg';
import './App.css';
import Greetingf from './components/pure/greetingF';
import TaskListComponent from './components/container/task_list';

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
        <TaskListComponent></TaskListComponent>
      </header>
    </div>
  );
}

export default App;
