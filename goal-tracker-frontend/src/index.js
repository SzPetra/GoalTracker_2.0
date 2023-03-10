import React from 'react';
import ReactDOM from 'react-dom/client';
import Navbar from './uiKit/components/Navbar';
import MyGoalsPage from './pages/myGoalsPage/MyGoalsPage';
import CommonGoalsPage from './pages/commonGoalsPage/CommonGoalsPage';
import UserProfilePage from './pages/userProfilePage/UserProfilePage';
import LandingPage from './pages/landingPage/LandingPage';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './index.css';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Navbar />}>
          <Route index element={<LandingPage/>}/> 
          <Route path="/mygoals" element={<MyGoalsPage/>} />
          <Route path="/goals" element={<CommonGoalsPage/>} />
          <Route path="/myprofile" element={<UserProfilePage/>} />
        </Route>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);

