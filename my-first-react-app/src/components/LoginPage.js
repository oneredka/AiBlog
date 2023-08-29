import React, {useState} from 'react';
import {useNavigate} from 'react-router-dom';
import {Form, Input, Button, Checkbox, Typography} from 'antd';
import { UserOutlined, LockOutlined } from '@ant-design/icons';


const {Title} = Typography;


const LoginPage = () => {
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();

    // handle login form submission
    const onFinish = (values) => {
        setLoading(true);
        const {username, password} = values;
        if ((username === "admin" || username === "test") && password === "123456") {
            // redirect to home page
            navigate("/home", {state: {username: username}});
        } else {
            // show login failed message
            console.log("login failed");
        }
        setTimeout(() => {
            setLoading(false);
            console.log('Received values of form:', values);
        }, 1000);
    };

    return (
        <div className="login-page">
            <div className="login-form">
                <Title level={3}>Login</Title>
                <Form
                    name="loginForm"
                    initialValues={{
                        remember: true,
                    }}
                    onFinish={onFinish}
                >
                    <Form.Item
                        name="username"
                        rules={[
                            {
                                required: true,
                                message: 'Please input your username!',
                            },
                        ]}
                    >
                        <Input prefix={<UserOutlined/>} placeholder="Username"/>
                    </Form.Item>

                    <Form.Item
                        name="password"
                        rules={[
                            {
                                required: true,
                                message: 'Please input your password!',
                            },
                        ]}
                    >
                        <Input.Password prefix={<LockOutlined/>} placeholder="Password"/>
                    </Form.Item>

                    <Form.Item>
                        <Form.Item name="remember" valuePropName="checked" noStyle>
                            <Checkbox>Remember me</Checkbox>
                        </Form.Item>

                        <a className="login-form-forgot" href="/">Forgot password</a>
                    </Form.Item>

                    <Form.Item>
                        <Button type="primary" htmlType="submit" className="login-form-button" loading={loading}>
                            Log in
                        </Button>
                        <div className="register-link">
                            Or <a href="/">register now!</a>
                        </div>
                    </Form.Item>
                </Form>
            </div>
        </div>
    );
};

export default LoginPage;
