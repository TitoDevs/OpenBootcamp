import './App.css';
import LoginUseReducer from './components/LoginUseReducer';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>useReducer Examples</h1>
        {/* <Counter></Counter> */}
        {/* <LoginUseState></LoginUseState> */}
        <LoginUseReducer></LoginUseReducer>
      </header>
    </div>
  );
}

export default App;
