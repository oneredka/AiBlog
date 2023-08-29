import React, {useEffect, useCallback} from 'react';
import axios from "axios";
import {useNavigate, NavLink} from "react-router-dom";

function HomePage() {
    const [userList, setUserList] = React.useState([]);
    useEffect(() => {
        fetchArticleList().then(r => console.log(r));
    }, []);

    const fetchArticleList = async () => {
        try {
            const response = await axios.get("http://localhost:8081/system/user/list");
            setUserList(response.data);
        } catch (error) {
            console.log("Error fetching article list:", error);
        }
    };

    const navigate = useNavigate();
    const toArticleDetails = (article) => {
        navigate(`/article/${article?.id}`, {
            state: {article: article}
        })
    }


    return (
        <div>
            <header>
                <nav>
                    <ul>
                        <li>
                            <NavLink to="/">Logout</NavLink>
                        </li>
                        <li>
                            <NavLink to="/blog">Blog</NavLink>
                        </li>
                        <li>
                            <NavLink to="/about">About us</NavLink>
                        </li>
                    </ul>
                </nav>
            </header>

            <main>
                <h1>Welcome</h1>
                <h3>This is article list</h3>
                <div>
                    {userList.map((user) => (
                        <div>
                            <button key={user.id} onClick={() => toArticleDetails(user)}>{user.loginName}</button>
                           {/* <li key={user.id}>{user.loginName}</li>*/}
                        </div>
                    ))}
                </div>
            </main>

            <footer>
                <p>this is footer</p>
            </footer>
        </div>
    );
}

export default HomePage;