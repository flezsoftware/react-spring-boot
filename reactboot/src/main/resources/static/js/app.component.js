class App extends React.Component {
    render() {
        return (
            <h1>Hello, person! {this.props.person.name} {this.props.person.surname}</h1>
        );
    }
}