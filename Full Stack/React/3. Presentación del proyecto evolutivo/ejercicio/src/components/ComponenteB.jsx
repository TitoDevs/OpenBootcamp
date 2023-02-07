import PropTypes from "prop-types";

export function ComponenteB(props) {
    const { contacto } = props;
  
    return (
      <div>
        {contacto.conectado ? (
          <p>Contacto en Línea</p>
        ) : (
          <p>Contacto No Disponible</p>
        )}
      </div>
    );
  }
  
  ComponenteB.propTypes = {
    contacto: PropTypes.shape({
      nombre: PropTypes.string.isRequired,
      apellido: PropTypes.string.isRequired,
      email: PropTypes.string.isRequired,
      conectado: PropTypes.bool.isRequired,
    }).isRequired,
  };