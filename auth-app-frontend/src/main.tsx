import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import './index.css';
import App from './App.tsx';
import { BrowserRouter , Routes, Route } from "react-router";
import Login from './pages/Login.tsx';
import Signup from './pages/Signup.tsx';
import About from './pages/About.tsx';
import Service from './pages/Service.tsx';


createRoot(document.getElementById('root')!).render(
 <BrowserRouter>
         <Routes>
      <Route path="/" element={<App />} />
      <Route path="/login" element={<Login />} />
      <Route path="/signup" element={<Signup />} />
      <Route path="/about" element={<About />} />
      <Route path="/service" element={<Service />} />


      
    </Routes>
 </BrowserRouter>
)
