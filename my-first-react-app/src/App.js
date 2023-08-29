import React from 'react';
import logo from './logo.svg';
import './App.css';
import HomePage from "./components/HomePage";
import LoginPage from "./components/LoginPage";
import ArticleDetailsPage from "./components/ArticleDetails";
import NotFoundPage from "./components/NotFound";
import {BrowserRouter, Route,Routes} from 'react-router-dom';


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<LoginPage/>}/>
                <Route path="/home" element={<HomePage/>}/>
                <Route path="/article" element={<ArticleDetailsPage/>}>
                    <Route path=":id" element={<ArticleDetailsPage/>}/>
                </Route>
                <Route path="*" element={<NotFoundPage/>}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;
