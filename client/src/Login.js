// src/Login.js
import React from 'react';

const Login = () => {
  const handleSocialLogin = (provider) => {
    window.location.href = `/oauth2/authorization/${provider}`;
    console.log(`Attempting to login with ${provider}`);
    const url = `/oauth2/authorization/${provider}`;
    console.log(`Redirecting to: ${url}`);
    window.location.href = url;
  };

  return (
    <div>
      <h1>Social Login</h1>
      <button onClick={() => handleSocialLogin('google')}>
        Login with Google
      </button>
      <button onClick={() => handleSocialLogin('kakao')}>
        Login with Kakao
      </button>
      <button onClick={() => handleSocialLogin('naver')}>
        Login with Naver
      </button>
    </div>
  );
};

export default Login;
