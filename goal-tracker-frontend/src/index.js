import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';
import Navbar from './uiKit/components/Navbar';
import './index.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import MyGoalsPage from './pages/myGoalsPage/MyGoalsPage';
import CommonGoalsPage from './pages/commonGoalsPage/CommonGoalsPage';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Navbar />}> 
          <Route path="/mygoals" element={<MyGoalsPage/>} />
          <Route path="/goals" element={<CommonGoalsPage/>} />
        </Route>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
