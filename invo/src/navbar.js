import React from 'react';
import UserCRUDComponent from './UserCRUDComponent';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Outlet } from 'react-router-dom';
function Navbar() {
  return (
    <>
    <nav className="navbar navbar-expand-lg navbar-dark bg-black">
      <a className="navbar-brand" href="#">Invo</a>
      <button
        className="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNav">
        <ul className="navbar-nav">
          <li className="nav-item active">
            <a className="nav-link" href="/">Home</a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="/UserCRUDComponent">CRUD</a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="./AboutUs">About Us</a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="/login">Login</a>
          </li>
        </ul>
      </div>
    </nav>
    <Outlet />
    </>
  );
}

export default Navbar;
