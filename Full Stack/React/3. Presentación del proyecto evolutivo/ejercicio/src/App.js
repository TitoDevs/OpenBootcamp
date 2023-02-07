import {Contacto} from "./models/Contacto"

// Componente principal en App.js
function App() {
  return (
    <div>
      <Contacto
        nombre="Tito"
        apellido="Dev"
        email="juan.perez@gmail.com"
        conectado={true}
      />
    </div>
  );
}

export default App;
