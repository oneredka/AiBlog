import { useLocation, NavLink } from 'react-router-dom';

function ArticleDetails() {
    debugger
    const location = useLocation();
    const article = location.state?.article;

    return (
        <div>
            <header>
                <nav>
                    <ul>
                        <li>
                            <NavLink replace={true} to="/home">回到首页</NavLink>
                        </li>
                    </ul>
                </nav>
            </header>

            <main>
                <h3>什么是戒断反应</h3>
                <p>主要内容区域</p>
                <div>
                    <p>作者：{article?.loginName}</p><br/>
                    <p>发布时间：{article?.createTime}</p><br/>
                    <p>内容：{article?.loginName}</p><br/>
                </div>
            </main>

            <footer>
                <p>This is footer</p>
            </footer>
        </div>
    );
}

export default ArticleDetails;