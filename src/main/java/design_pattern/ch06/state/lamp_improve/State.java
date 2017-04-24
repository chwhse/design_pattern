package design_pattern.ch06.state.lamp_improve;

interface State {
	/*public abstract 생략됨*/	void on_button_pushed(Light light);
	void off_button_pushed(Light light);

}
