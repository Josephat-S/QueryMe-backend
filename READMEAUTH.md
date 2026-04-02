# QueryMe — Auth Module (Group J)

## Base URL
```
http://localhost:8080
```

## Authentication
All endpoints require a JWT token in the header:
```
Authorization: Bearer <your_token_here>
```

---

## Endpoints

### Auth

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| POST | `/api/auth/register` | Register a new user | No |
| POST | `/api/auth/login` | Login and get JWT token | No |
| POST | `/api/auth/validate` | Validate a JWT token | No |
| GET | `/api/auth/me` | Get current user profile | Yes |
| GET | `/api/auth/users` | Get all users | Yes (ADMIN) |
| GET | `/api/auth/users/{id}` | Get user by ID | Yes (ADMIN) |

### Login Session

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/login-session/me` | List current user's login sessions | Yes |
| DELETE | `/login-session/{id}` | Revoke one of current user's sessions | Yes |
| DELETE | `/login-session/me/current` | Revoke current session/token | Yes |
| DELETE | `/login-session/me/all` | Revoke all active sessions for current user | Yes |

---

## Request & Response Examples

### Register
```
POST /api/auth/register
```
```json
{
  "email": "john@example.com",
  "password": "secret123",
  "role": "STUDENT"
}
```
**Response `201`:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "tokenType": "Bearer",
  "userId": "a3f1c2d4-1234-5678-abcd-ef0123456789",
  "email": "john@example.com",
  "role": "STUDENT"
}
```

---

### Login
```
POST /api/auth/login
```
```json
{
  "email": "john@example.com",
  "password": "secret123"
}
```
**Response `200`:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "tokenType": "Bearer",
  "userId": "a3f1c2d4-1234-5678-abcd-ef0123456789",
  "email": "john@example.com",
  "role": "STUDENT"
}
```

---

### Revoke One Session
```
DELETE /login-session/{id}
Authorization: Bearer <token>
```
**Response `200`:**
```json
{
  "message": "Session revoked successfully"
}
```

---

### Revoke Current Session
```
DELETE /login-session/me/current
Authorization: Bearer <token>
```
**Response `200`:**
```json
{
  "message": "Current session revoked successfully"
}
```

---

### Revoke All Sessions
```
DELETE /login-session/me/all
Authorization: Bearer <token>
```
**Response `200`:**
```json
{
  "message": "All sessions revoked successfully"
}
```

---

## Default Test Users

| Role | Email | Password |
|------|-------|----------|
| ADMIN | admin@queryme.com | admin123 |
| TEACHER | teacher@queryme.com | teacher123 |
| STUDENT | student@queryme.com | student123 |

---

*Group J — QueryMe Auth Module*
