import React, { Component } from "react";
import { ComponenteB } from "../components/ComponenteB"
import PropTypes from "prop-types";

export class Contacto extends Component {
    constructor(props) {
      super(props);
      this.state = {
        nombre: props.nombre,
        apellido: props.apellido,
        email: props.email,
        conectado: props.conectado,
      };
    }
  
    render() {
      return (
        <div>
          <h2>{this.state.nombre} {this.state.apellido}</h2>
          <p>Email: {this.state.email}</p>
          <ComponenteB contacto={this.state} />
        </div>
      );
    }
  }

  
Contacto.propTypes = {
    nombre: PropTypes.string.isRequired,
    apellido: PropTypes.string.isRequired,
    email: PropTypes.string.isRequired,
    conectado: PropTypes.bool.isRequired,
  };