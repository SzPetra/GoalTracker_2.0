import React from "react";
import { Link, Outlet } from "react-router-dom";

const Navbar = () => {

    return (
        <>
            <nav className="nav-container">
                <Link to="/mygoals">MY goals</Link>
                <Link to="/goals">Goals</Link>
                <Link to="/myprofile">MY profile</Link>
            </nav>
            <Outlet/>
        </>
        
        
    )
}

export default Navbar;