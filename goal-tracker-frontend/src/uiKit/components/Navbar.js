import React from "react";
import { Link, Outlet } from "react-router-dom";
import "../assets/navbar.css";

const Navbar = () => {

    return (
        <>
            <nav className="nav-container">
                <Link className="nav-link" to="/mygoals">MY goals</Link>
                <Link className="nav-link" to="/goals">Goals</Link>
                <Link className="nav-link" to="/myprofile">MY profile</Link>
            </nav>
            <Outlet/>
        </>
        
        
    )
}

export default Navbar;